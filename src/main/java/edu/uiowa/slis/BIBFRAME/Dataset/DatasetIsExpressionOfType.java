package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIsExpressionOfIterator theDatasetIsExpressionOfIterator = (DatasetIsExpressionOfIterator)findAncestorWithClass(this, DatasetIsExpressionOfIterator.class);
			pageContext.getOut().print(theDatasetIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

