package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectTranslatedAsIterator theThreeDimensionalObjectTranslatedAsIterator = (ThreeDimensionalObjectTranslatedAsIterator)findAncestorWithClass(this, ThreeDimensionalObjectTranslatedAsIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

