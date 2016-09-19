package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetFollowsInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetFollowsInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetFollowsInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetFollowsInNarrativeInverseIterator theDatasetFollowsInNarrativeInverseIterator = (DatasetFollowsInNarrativeInverseIterator)findAncestorWithClass(this, DatasetFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theDatasetFollowsInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

