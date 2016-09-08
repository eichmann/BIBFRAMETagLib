package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasOriginPlaceIterator theContinuingResourceHasOriginPlaceIterator = (ContinuingResourceHasOriginPlaceIterator)findAncestorWithClass(this, ContinuingResourceHasOriginPlaceIterator.class);
			pageContext.getOut().print(theContinuingResourceHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

