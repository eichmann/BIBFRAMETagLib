package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			if (!theDataset.commitNeeded) {
				pageContext.getOut().print(theDataset.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			return theDataset.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Dataset for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			theDataset.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for label tag ");
		}
	}
}

