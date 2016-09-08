package edu.uiowa.slis.BIBFRAME.TranslatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslatedTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TranslatedTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslatedTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TranslatedTitle theTranslatedTitle = (TranslatedTitle)findAncestorWithClass(this, TranslatedTitle.class);
			if (!theTranslatedTitle.commitNeeded) {
				pageContext.getOut().print(theTranslatedTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TranslatedTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			TranslatedTitle theTranslatedTitle = (TranslatedTitle)findAncestorWithClass(this, TranslatedTitle.class);
			return theTranslatedTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing TranslatedTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			TranslatedTitle theTranslatedTitle = (TranslatedTitle)findAncestorWithClass(this, TranslatedTitle.class);
			theTranslatedTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing TranslatedTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for subjectURI tag ");
		}
	}
}

