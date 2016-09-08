package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasOriginPlaceIterator theContinuingResourceHasOriginPlaceIterator = (ContinuingResourceHasOriginPlaceIterator)findAncestorWithClass(this, ContinuingResourceHasOriginPlaceIterator.class);
			pageContext.getOut().print(theContinuingResourceHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

