package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectTranslatedAsIterator theThreeDimensionalObjectTranslatedAsIterator = (ThreeDimensionalObjectTranslatedAsIterator)findAncestorWithClass(this, ThreeDimensionalObjectTranslatedAsIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

