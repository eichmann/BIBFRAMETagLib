package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetFollowsIterator theDatasetFollowsIterator = (DatasetFollowsIterator)findAncestorWithClass(this, DatasetFollowsIterator.class);
			pageContext.getOut().print(theDatasetFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for follows tag ");
		}
		return SKIP_BODY;
	}
}

