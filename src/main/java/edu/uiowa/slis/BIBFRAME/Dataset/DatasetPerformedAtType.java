package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetPerformedAtIterator theDatasetPerformedAtIterator = (DatasetPerformedAtIterator)findAncestorWithClass(this, DatasetPerformedAtIterator.class);
			pageContext.getOut().print(theDatasetPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

