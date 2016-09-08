package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetSplitIntoIterator theDatasetSplitIntoIterator = (DatasetSplitIntoIterator)findAncestorWithClass(this, DatasetSplitIntoIterator.class);
			pageContext.getOut().print(theDatasetSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

