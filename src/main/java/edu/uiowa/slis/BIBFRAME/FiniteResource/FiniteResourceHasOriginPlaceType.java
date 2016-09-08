package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasOriginPlaceIterator theFiniteResourceHasOriginPlaceIterator = (FiniteResourceHasOriginPlaceIterator)findAncestorWithClass(this, FiniteResourceHasOriginPlaceIterator.class);
			pageContext.getOut().print(theFiniteResourceHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

