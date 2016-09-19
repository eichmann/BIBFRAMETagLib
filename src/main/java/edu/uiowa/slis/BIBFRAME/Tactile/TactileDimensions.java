package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileDimensions extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileDimensions currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileDimensions.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileDimensionsIterator theTactile = (TactileDimensionsIterator)findAncestorWithClass(this, TactileDimensionsIterator.class);
			pageContext.getOut().print(theTactile.getDimensions());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for dimensions tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for dimensions tag ");
		}
		return SKIP_BODY;
	}
}

