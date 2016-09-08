package edu.uiowa.slis.BIBFRAME.Language;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LanguageSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LanguageSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LanguageSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Language theLanguage = (Language)findAncestorWithClass(this, Language.class);
			if (!theLanguage.commitNeeded) {
				pageContext.getOut().print(theLanguage.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Language for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Language for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Language theLanguage = (Language)findAncestorWithClass(this, Language.class);
			return theLanguage.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Language for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Language for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Language theLanguage = (Language)findAncestorWithClass(this, Language.class);
			theLanguage.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Language for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Language for subjectURI tag ");
		}
	}
}

