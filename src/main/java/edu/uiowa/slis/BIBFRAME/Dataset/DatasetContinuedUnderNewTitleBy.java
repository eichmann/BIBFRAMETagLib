package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetContinuedUnderNewTitleByIterator theDatasetContinuedUnderNewTitleByIterator = (DatasetContinuedUnderNewTitleByIterator)findAncestorWithClass(this, DatasetContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theDatasetContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

