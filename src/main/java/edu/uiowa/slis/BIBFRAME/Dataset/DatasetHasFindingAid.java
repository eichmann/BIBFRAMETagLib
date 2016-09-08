package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasFindingAidIterator theDatasetHasFindingAidIterator = (DatasetHasFindingAidIterator)findAncestorWithClass(this, DatasetHasFindingAidIterator.class);
			pageContext.getOut().print(theDatasetHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

