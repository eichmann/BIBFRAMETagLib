package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetCreatedForDegreeIterator theDatasetCreatedForDegreeIterator = (DatasetCreatedForDegreeIterator)findAncestorWithClass(this, DatasetCreatedForDegreeIterator.class);
			pageContext.getOut().print(theDatasetCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

