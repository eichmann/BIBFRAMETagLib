package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIsFindingAidForIterator theDatasetIsFindingAidForIterator = (DatasetIsFindingAidForIterator)findAncestorWithClass(this, DatasetIsFindingAidForIterator.class);
			pageContext.getOut().print(theDatasetIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

