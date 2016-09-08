package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasOriginPlaceIterator theCollectionHasOriginPlaceIterator = (CollectionHasOriginPlaceIterator)findAncestorWithClass(this, CollectionHasOriginPlaceIterator.class);
			pageContext.getOut().print(theCollectionHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

