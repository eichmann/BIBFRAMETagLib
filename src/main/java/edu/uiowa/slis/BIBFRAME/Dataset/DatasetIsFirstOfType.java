package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIsFirstOfIterator theDatasetIsFirstOfIterator = (DatasetIsFirstOfIterator)findAncestorWithClass(this, DatasetIsFirstOfIterator.class);
			pageContext.getOut().print(theDatasetIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

