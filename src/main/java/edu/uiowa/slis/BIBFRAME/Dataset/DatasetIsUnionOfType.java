package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIsUnionOfIterator theDatasetIsUnionOfIterator = (DatasetIsUnionOfIterator)findAncestorWithClass(this, DatasetIsUnionOfIterator.class);
			pageContext.getOut().print(theDatasetIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

