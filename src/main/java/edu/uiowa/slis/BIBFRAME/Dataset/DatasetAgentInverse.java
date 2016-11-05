package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetAgentInverseIterator theDatasetAgentInverseIterator = (DatasetAgentInverseIterator)findAncestorWithClass(this, DatasetAgentInverseIterator.class);
			pageContext.getOut().print(theDatasetAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for agent tag ");
		}
		return SKIP_BODY;
	}
}

