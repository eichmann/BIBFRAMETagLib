package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasDataSourceIterator theDatasetHasDataSourceIterator = (DatasetHasDataSourceIterator)findAncestorWithClass(this, DatasetHasDataSourceIterator.class);
			pageContext.getOut().print(theDatasetHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

