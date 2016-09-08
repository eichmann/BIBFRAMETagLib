package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectLanguageIterator theThreeDimensionalObjectLanguageIterator = (ThreeDimensionalObjectLanguageIterator)findAncestorWithClass(this, ThreeDimensionalObjectLanguageIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for language tag ");
		}
		return SKIP_BODY;
	}
}

