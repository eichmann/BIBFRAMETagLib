package edu.uiowa.slis.BIBFRAME.ContentAsText;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContentAsTextSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContentAsTextSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ContentAsTextSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ContentAsText theContentAsText = (ContentAsText)findAncestorWithClass(this, ContentAsText.class);
			if (!theContentAsText.commitNeeded) {
				pageContext.getOut().print(theContentAsText.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ContentAsText for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContentAsText for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ContentAsText theContentAsText = (ContentAsText)findAncestorWithClass(this, ContentAsText.class);
			return theContentAsText.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ContentAsText for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContentAsText for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ContentAsText theContentAsText = (ContentAsText)findAncestorWithClass(this, ContentAsText.class);
			theContentAsText.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ContentAsText for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContentAsText for subjectURI tag ");
		}
	}
}

