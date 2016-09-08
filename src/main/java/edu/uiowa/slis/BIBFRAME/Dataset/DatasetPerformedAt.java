package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetPerformedAtIterator theDatasetPerformedAtIterator = (DatasetPerformedAtIterator)findAncestorWithClass(this, DatasetPerformedAtIterator.class);
			pageContext.getOut().print(theDatasetPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

