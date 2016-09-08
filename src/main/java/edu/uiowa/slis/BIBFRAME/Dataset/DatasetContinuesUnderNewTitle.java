package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetContinuesUnderNewTitleIterator theDatasetContinuesUnderNewTitleIterator = (DatasetContinuesUnderNewTitleIterator)findAncestorWithClass(this, DatasetContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theDatasetContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

