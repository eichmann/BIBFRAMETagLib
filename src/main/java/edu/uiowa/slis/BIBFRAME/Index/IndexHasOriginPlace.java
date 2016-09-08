package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasOriginPlaceIterator theIndexHasOriginPlaceIterator = (IndexHasOriginPlaceIterator)findAncestorWithClass(this, IndexHasOriginPlaceIterator.class);
			pageContext.getOut().print(theIndexHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

