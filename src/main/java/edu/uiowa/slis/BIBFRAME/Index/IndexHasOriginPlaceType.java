package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasOriginPlaceIterator theIndexHasOriginPlaceIterator = (IndexHasOriginPlaceIterator)findAncestorWithClass(this, IndexHasOriginPlaceIterator.class);
			pageContext.getOut().print(theIndexHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

