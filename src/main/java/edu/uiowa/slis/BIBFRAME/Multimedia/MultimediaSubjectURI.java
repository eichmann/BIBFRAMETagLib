package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Multimedia theMultimedia = (Multimedia)findAncestorWithClass(this, Multimedia.class);
			if (!theMultimedia.commitNeeded) {
				pageContext.getOut().print(theMultimedia.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Multimedia theMultimedia = (Multimedia)findAncestorWithClass(this, Multimedia.class);
			return theMultimedia.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Multimedia for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Multimedia theMultimedia = (Multimedia)findAncestorWithClass(this, Multimedia.class);
			theMultimedia.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for subjectURI tag ");
		}
	}
}

