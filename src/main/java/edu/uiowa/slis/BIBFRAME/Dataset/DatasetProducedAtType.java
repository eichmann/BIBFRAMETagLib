package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetProducedAtIterator theDatasetProducedAtIterator = (DatasetProducedAtIterator)findAncestorWithClass(this, DatasetProducedAtIterator.class);
			pageContext.getOut().print(theDatasetProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

