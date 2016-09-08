package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetSplitIntoIterator theDatasetSplitIntoIterator = (DatasetSplitIntoIterator)findAncestorWithClass(this, DatasetSplitIntoIterator.class);
			pageContext.getOut().print(theDatasetSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

