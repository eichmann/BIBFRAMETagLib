package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasAbsorbedIterator theDatasetHasAbsorbedIterator = (DatasetHasAbsorbedIterator)findAncestorWithClass(this, DatasetHasAbsorbedIterator.class);
			pageContext.getOut().print(theDatasetHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

