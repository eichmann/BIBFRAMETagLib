package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationLanguageIterator theDissertationLanguageIterator = (DissertationLanguageIterator)findAncestorWithClass(this, DissertationLanguageIterator.class);
			pageContext.getOut().print(theDissertationLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for language tag ");
		}
		return SKIP_BODY;
	}
}
