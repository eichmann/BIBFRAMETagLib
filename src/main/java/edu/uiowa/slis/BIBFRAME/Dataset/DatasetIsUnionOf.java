package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIsUnionOfIterator theDatasetIsUnionOfIterator = (DatasetIsUnionOfIterator)findAncestorWithClass(this, DatasetIsUnionOfIterator.class);
			pageContext.getOut().print(theDatasetIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

