package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasOriginPlaceIterator theDissertationHasOriginPlaceIterator = (DissertationHasOriginPlaceIterator)findAncestorWithClass(this, DissertationHasOriginPlaceIterator.class);
			pageContext.getOut().print(theDissertationHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

