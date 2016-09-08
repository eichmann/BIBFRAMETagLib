package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasInstanceIterator theDatasetHasInstanceIterator = (DatasetHasInstanceIterator)findAncestorWithClass(this, DatasetHasInstanceIterator.class);
			pageContext.getOut().print(theDatasetHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

