package edu.uiowa.slis.BIBFRAME.Language;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LanguageLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LanguageLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LanguageLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Language theLanguage = (Language)findAncestorWithClass(this, Language.class);
			if (!theLanguage.commitNeeded) {
				pageContext.getOut().print(theLanguage.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Language for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Language for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Language theLanguage = (Language)findAncestorWithClass(this, Language.class);
			return theLanguage.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Language for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Language for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Language theLanguage = (Language)findAncestorWithClass(this, Language.class);
			theLanguage.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Language for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Language for label tag ");
		}
	}
}

