package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileLanguageIterator theTactileLanguageIterator = (TactileLanguageIterator)findAncestorWithClass(this, TactileLanguageIterator.class);
			pageContext.getOut().print(theTactileLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for language tag ");
		}
		return SKIP_BODY;
	}
}

