package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetSupersedesIterator theDatasetSupersedesIterator = (DatasetSupersedesIterator)findAncestorWithClass(this, DatasetSupersedesIterator.class);
			pageContext.getOut().print(theDatasetSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

