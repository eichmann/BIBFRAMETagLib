package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasOriginPlaceIterator theDatasetHasOriginPlaceIterator = (DatasetHasOriginPlaceIterator)findAncestorWithClass(this, DatasetHasOriginPlaceIterator.class);
			pageContext.getOut().print(theDatasetHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

