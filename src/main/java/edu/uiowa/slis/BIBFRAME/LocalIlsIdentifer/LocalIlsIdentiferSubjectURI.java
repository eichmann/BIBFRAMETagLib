package edu.uiowa.slis.BIBFRAME.LocalIlsIdentifer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocalIlsIdentiferSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocalIlsIdentiferSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LocalIlsIdentiferSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LocalIlsIdentifer theLocalIlsIdentifer = (LocalIlsIdentifer)findAncestorWithClass(this, LocalIlsIdentifer.class);
			if (!theLocalIlsIdentifer.commitNeeded) {
				pageContext.getOut().print(theLocalIlsIdentifer.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LocalIlsIdentifer for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LocalIlsIdentifer for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LocalIlsIdentifer theLocalIlsIdentifer = (LocalIlsIdentifer)findAncestorWithClass(this, LocalIlsIdentifer.class);
			return theLocalIlsIdentifer.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LocalIlsIdentifer for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LocalIlsIdentifer for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LocalIlsIdentifer theLocalIlsIdentifer = (LocalIlsIdentifer)findAncestorWithClass(this, LocalIlsIdentifer.class);
			theLocalIlsIdentifer.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LocalIlsIdentifer for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LocalIlsIdentifer for subjectURI tag ");
		}
	}
}

