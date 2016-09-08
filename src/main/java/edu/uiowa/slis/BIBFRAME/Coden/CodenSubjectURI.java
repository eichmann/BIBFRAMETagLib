package edu.uiowa.slis.BIBFRAME.Coden;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodenSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CodenSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CodenSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Coden theCoden = (Coden)findAncestorWithClass(this, Coden.class);
			if (!theCoden.commitNeeded) {
				pageContext.getOut().print(theCoden.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Coden for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coden for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Coden theCoden = (Coden)findAncestorWithClass(this, Coden.class);
			return theCoden.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Coden for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coden for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Coden theCoden = (Coden)findAncestorWithClass(this, Coden.class);
			theCoden.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Coden for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coden for subjectURI tag ");
		}
	}
}

