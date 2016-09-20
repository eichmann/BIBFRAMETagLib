package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasOriginPlaceIterator theDissertationHasOriginPlaceIterator = (DissertationHasOriginPlaceIterator)findAncestorWithClass(this, DissertationHasOriginPlaceIterator.class);
			pageContext.getOut().print(theDissertationHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

