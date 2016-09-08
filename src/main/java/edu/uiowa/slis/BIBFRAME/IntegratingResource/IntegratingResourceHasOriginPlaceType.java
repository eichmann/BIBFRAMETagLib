package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasOriginPlaceIterator theIntegratingResourceHasOriginPlaceIterator = (IntegratingResourceHasOriginPlaceIterator)findAncestorWithClass(this, IntegratingResourceHasOriginPlaceIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

