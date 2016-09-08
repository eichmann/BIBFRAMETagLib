package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasOriginPlaceIterator theFiniteResourceHasOriginPlaceIterator = (FiniteResourceHasOriginPlaceIterator)findAncestorWithClass(this, FiniteResourceHasOriginPlaceIterator.class);
			pageContext.getOut().print(theFiniteResourceHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

