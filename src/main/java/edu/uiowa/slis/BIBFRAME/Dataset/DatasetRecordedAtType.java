package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetRecordedAtIterator theDatasetRecordedAtIterator = (DatasetRecordedAtIterator)findAncestorWithClass(this, DatasetRecordedAtIterator.class);
			pageContext.getOut().print(theDatasetRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

