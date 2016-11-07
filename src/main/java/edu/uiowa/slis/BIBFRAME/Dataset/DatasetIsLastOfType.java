package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIsLastOfIterator theDatasetIsLastOfIterator = (DatasetIsLastOfIterator)findAncestorWithClass(this, DatasetIsLastOfIterator.class);
			pageContext.getOut().print(theDatasetIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}
