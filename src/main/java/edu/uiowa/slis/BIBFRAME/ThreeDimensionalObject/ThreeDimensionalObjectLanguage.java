package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectLanguageIterator theThreeDimensionalObjectLanguageIterator = (ThreeDimensionalObjectLanguageIterator)findAncestorWithClass(this, ThreeDimensionalObjectLanguageIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for language tag ");
		}
		return SKIP_BODY;
	}
}

