package edu.uiowa.slis.BIBFRAME.LinguisticSystem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LinguisticSystemLanguageInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LinguisticSystemLanguageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LinguisticSystemLanguageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LinguisticSystemLanguageInverseIterator theLinguisticSystemLanguageInverseIterator = (LinguisticSystemLanguageInverseIterator)findAncestorWithClass(this, LinguisticSystemLanguageInverseIterator.class);
			pageContext.getOut().print(theLinguisticSystemLanguageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LinguisticSystem for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing LinguisticSystem for language tag ");
		}
		return SKIP_BODY;
	}
}

