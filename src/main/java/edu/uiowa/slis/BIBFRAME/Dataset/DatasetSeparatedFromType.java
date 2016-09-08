package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetSeparatedFromIterator theDatasetSeparatedFromIterator = (DatasetSeparatedFromIterator)findAncestorWithClass(this, DatasetSeparatedFromIterator.class);
			pageContext.getOut().print(theDatasetSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

