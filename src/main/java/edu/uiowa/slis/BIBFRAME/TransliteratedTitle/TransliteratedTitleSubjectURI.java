package edu.uiowa.slis.BIBFRAME.TransliteratedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransliteratedTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TransliteratedTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TransliteratedTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TransliteratedTitle theTransliteratedTitle = (TransliteratedTitle)findAncestorWithClass(this, TransliteratedTitle.class);
			if (!theTransliteratedTitle.commitNeeded) {
				pageContext.getOut().print(theTransliteratedTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			TransliteratedTitle theTransliteratedTitle = (TransliteratedTitle)findAncestorWithClass(this, TransliteratedTitle.class);
			return theTransliteratedTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing TransliteratedTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			TransliteratedTitle theTransliteratedTitle = (TransliteratedTitle)findAncestorWithClass(this, TransliteratedTitle.class);
			theTransliteratedTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for subjectURI tag ");
		}
	}
}

