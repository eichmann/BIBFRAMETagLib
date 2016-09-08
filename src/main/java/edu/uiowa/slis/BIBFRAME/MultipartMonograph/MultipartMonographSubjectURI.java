package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MultipartMonograph theMultipartMonograph = (MultipartMonograph)findAncestorWithClass(this, MultipartMonograph.class);
			if (!theMultipartMonograph.commitNeeded) {
				pageContext.getOut().print(theMultipartMonograph.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			MultipartMonograph theMultipartMonograph = (MultipartMonograph)findAncestorWithClass(this, MultipartMonograph.class);
			return theMultipartMonograph.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing MultipartMonograph for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			MultipartMonograph theMultipartMonograph = (MultipartMonograph)findAncestorWithClass(this, MultipartMonograph.class);
			theMultipartMonograph.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for subjectURI tag ");
		}
	}
}

