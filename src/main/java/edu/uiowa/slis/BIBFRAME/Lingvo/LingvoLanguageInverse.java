package edu.uiowa.slis.BIBFRAME.Lingvo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LingvoLanguageInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LingvoLanguageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LingvoLanguageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LingvoLanguageInverseIterator theLingvoLanguageInverseIterator = (LingvoLanguageInverseIterator)findAncestorWithClass(this, LingvoLanguageInverseIterator.class);
			pageContext.getOut().print(theLingvoLanguageInverseIterator.getLanguageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Lingvo for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lingvo for language tag ");
		}
		return SKIP_BODY;
	}
}

