package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasDataSourceInverseIterator theDatasetHasDataSourceInverseIterator = (DatasetHasDataSourceInverseIterator)findAncestorWithClass(this, DatasetHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theDatasetHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

