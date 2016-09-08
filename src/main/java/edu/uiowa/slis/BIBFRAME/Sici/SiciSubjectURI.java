package edu.uiowa.slis.BIBFRAME.Sici;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SiciSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SiciSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SiciSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Sici theSici = (Sici)findAncestorWithClass(this, Sici.class);
			if (!theSici.commitNeeded) {
				pageContext.getOut().print(theSici.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Sici for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sici for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Sici theSici = (Sici)findAncestorWithClass(this, Sici.class);
			return theSici.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Sici for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sici for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Sici theSici = (Sici)findAncestorWithClass(this, Sici.class);
			theSici.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Sici for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sici for subjectURI tag ");
		}
	}
}

